package com.as.mvc.djview;
  
public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        @SuppressWarnings("unused")
		ControllerInterface model = new HeartController(heartModel);
    }
}
