package com.team254.cheezdroid;

import android.hardware.camera2.CaptureRequest;

public class Settings {

    public static class CameraSettings {

        static final int CONTROL_MODE = CaptureRequest.CONTROL_MODE_OFF;
        static final int DIGITAL_STABILIZATION_MODE = CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE_OFF;
        static final int MECHANICAL_STABILIZATION_MODE = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE_OFF;
        static final long EXPOSURE_TIME_NANOSECOND = (long) 1e7;
        static final float FOCAL_LENGTH_M = .2f;
    }

    public static class RobotConnection {
        public static final int K_ROBOT_PORT = 8254;
        public static final String K_ROBOT_PROXY_HOST = "localhost";
        public static final int K_CONNECTOR_SLEEP_MS = 100;
        public static final int K_THRESHOLD_HEARTBEAT = 800;
        public static final int K_SEND_HEARTBEAT_PERIOD = 100;
    }

}
