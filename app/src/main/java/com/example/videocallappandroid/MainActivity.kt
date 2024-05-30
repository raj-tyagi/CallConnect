package com.example.videocallappandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.cardview.widget.CardView
import com.zegocloud.uikit.prebuilt.call.ZegoUIKitPrebuiltCallService
import com.zegocloud.uikit.prebuilt.call.config.ZegoNotificationConfig
import com.zegocloud.uikit.prebuilt.call.invite.ZegoUIKitPrebuiltCallInvitationConfig
import com.zegocloud.uikit.prebuilt.call.invite.ZegoUIKitPrebuiltCallInvitationService

class MainActivity : AppCompatActivity() {

    private lateinit var userIdTextField: EditText
    private lateinit var button: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userIdTextField = findViewById(R.id.user_id_text_field)
        button = findViewById(R.id.button_next)

        button.setOnClickListener {
            val userId = userIdTextField.text.toString()
            if (userId.isNotEmpty()) {
                val intent = Intent(this@MainActivity, VideoCallActivity::class.java)
                intent.putExtra("userID", userId)
                startActivity(intent)

                videoCallServices(userId)
            }
        }
    }

    private fun videoCallServices(userID: String) {
        val appID: Long = 1522513164 // your App ID of Zego Cloud
        val appSign = "9b72e555e43cedc9054ae16cdc90b7d37f5d017b5a40397e4d62ff3f4e73dc2c" // your App Sign of Zego Cloud
        val application = application // Android's application context

        val callInvitationConfig = ZegoUIKitPrebuiltCallInvitationConfig()
        val notificationConfig = ZegoNotificationConfig()
        notificationConfig.sound = "zego_uikit_sound_call"
        notificationConfig.channelID = "CallInvitation"
        notificationConfig.channelName = "CallInvitation"
        ZegoUIKitPrebuiltCallInvitationService.init(
            application,
            appID,
            appSign,
            userID,
            userID,
            callInvitationConfig
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        ZegoUIKitPrebuiltCallService.unInit()
    }
}
