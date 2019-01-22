package com.blaqueyard.main;


/**
 * Created by admin on 1/22/19.
 */

import com.ibm.watson.developer_cloud.service.security.IamOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectFacesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.DetectedFaces;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Fredrick Oluoch
 * http://www.blaqueyard.com
 * 0720106420 | 0722508906
 * email: menty44@gmail.com
 */

public class FaceMain {
    public static void main(String[]args) throws FileNotFoundException {
        System.out.print("### ######################### ###\n");
        System.out.print("# ** hello  testing ibm AI   ** #\n");
        System.out.print("### ######################### ###\n");


        IamOptions options = new IamOptions.Builder()
                .apiKey("g2lVDPrOue8CrQUn02sFr9XLrXqvVKzuIXcJN5DxGP9o")
                .build();

        VisualRecognition service = new VisualRecognition("2018-03-19", options);

        DetectFacesOptions detectFacesOptions = new DetectFacesOptions.Builder()
                .imagesFile(new File("ibmfemale.jpg"))
                .build();
        DetectedFaces result = service.detectFaces(detectFacesOptions).execute();
        System.out.println(result);

        System.out.print("###############################\n");
        System.out.print("###        end the AI       ###\n");
        System.out.print("###############################\n");
    }
}
