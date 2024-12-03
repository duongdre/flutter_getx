package com.example.flutter_getx

import android.content.Intent
import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MainActivity: FlutterActivity() {
    private val CHANNEL = "com.example.flutter_getx/navigate"

    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL).setMethodCallHandler {
                call, result ->
//            if (call.method.equals("openMainScreen")) {
//                openMainScreen()
//                result.success(null)
//            } else {
//                result.notImplemented()
//            }
        }

        // Set up flutter method channel
//        MethodChannel(
//            getFlutterEngine().getDartExecutor().getBinaryMessenger(),
//            MainActivity.CHANNEL
//        )
//            .setMethodCallHandler { call, result ->
//                if (call.method.equals("openMainScreen")) {
//                    openMainScreen()
//                    result.success(null)
//                } else {
//                    result.notImplemented()
//                }
//            }
    }


    // Method to open the MainActivity (essentially the screen this is already)
    private fun openMainScreen() {
        val intent: Intent = Intent(this, MainActivity2::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK) // Optional: Clear the back stack
        startActivity(intent)
    }
}