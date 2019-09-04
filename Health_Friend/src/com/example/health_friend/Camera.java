package com.example.health_friend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Camera extends Activity{
	ImageView imgFavorite;
	Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.camera);
		btn =(Button) findViewById(R.id.cream_btn);
		imgFavorite = (ImageView) findViewById(R.id.cream);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				open();
			}

			private void open() {
				// TODO �Զ����ɵķ������
				Intent intent0 = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent0, 0);
			}
		});
		
	}
	
	public static void saveImageToGallery(Context context, Bitmap bmp) {
        // ���ȱ���ͼƬ
        File appDir = new File(Environment.getExternalStorageDirectory(),
                "Health_Friend");
        if (!appDir.exists()) {
            appDir.mkdir();
        }
        String fileName = System.currentTimeMillis() + ".jpg";
        File file = new File(appDir, fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
           Toast.makeText(context, "����ʧ��", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        } catch (IOException e) {
        	Toast.makeText(context, "����ʧ��", Toast.LENGTH_SHORT).show();;
            e.printStackTrace();
        }

        // ��ΰ��ļ����뵽ϵͳͼ��
        try {
            MediaStore.Images.Media.insertImage(context.getContentResolver(),
                    file.getAbsolutePath(), fileName, null);
            Toast.makeText(context, "����ɹ�", Toast.LENGTH_SHORT).show();;
        } catch (FileNotFoundException e) {
        	Toast.makeText(context, "����ʧ��", Toast.LENGTH_SHORT).show();;
            e.printStackTrace();
        }
        // ���֪ͨͼ�����
        context.sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,
                Uri.fromFile(new File(file.getPath()))));
    }
	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO �Զ����ɵķ������
		super.onActivityResult(requestCode, resultCode, data);
		
		Bitmap bp = (Bitmap) data.getExtras().get("data");
	    imgFavorite.setImageBitmap(bp);
	    saveImageToGallery(Camera.this, bp);
	}

}
