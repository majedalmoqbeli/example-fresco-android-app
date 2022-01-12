package com.majedalmoqbeli.examplefresco;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // initView
        SimpleDraweeView draweeView = findViewById(R.id.my_image_view);
        SimpleDraweeView draweeView2 = findViewById(R.id.my_image_view1);


        // image url
        Uri uri = Uri.parse("https://majedalmoqbeli.com/images/image1.jpg");
        Uri thumbUri = Uri.parse("https://majedalmoqbeli.com/images/image_low.jpg");

        Uri uri2 = Uri.parse("https://majedalmoqbeli.com/images/image2.jpg");
        Uri thumbUri2 = Uri.parse("https://majedalmoqbeli.com/images/image2_low.jpg");


        // call this to start loading images
        loadImage(draweeView, thumbUri, uri);
        loadImage(draweeView2, thumbUri2, uri2);

    }

    /**
     * use this library to get image from url with thumb and real image
     *
     * @param view : SimpleDraweeView
     * @param thumb : uri of low image
     * @param image : uri of image with full size
     */
    public static void loadImage(SimpleDraweeView view, Uri thumb, Uri image) {
        DraweeController controller2 = Fresco.newDraweeControllerBuilder()
                .setLowResImageRequest(ImageRequest.fromUri(thumb))
                .setImageRequest(ImageRequest.fromUri(image))
                .setOldController(view.getController())
                .build();
        view.setController(controller2);

    }
}