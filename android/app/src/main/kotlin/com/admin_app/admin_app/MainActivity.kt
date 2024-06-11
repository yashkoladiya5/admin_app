package com.admin_app.admin_app
import android.content.Context
import android.content.Intent
import android.os.UserHandle
import android.widget.Toast
import com.admin_app.admin_app.R

import io.flutter.embedding.android.FlutterActivity




class MainActivity: FlutterActivity(){
    private fun showToast(context: Context, msg: String) {
        context.getString(R.string.admin_receiver_status, msg).let { status ->
            Toast.makeText(context, status, Toast.LENGTH_SHORT).show()
        }
    }

    fun onEnabled(context: Context, intent: Intent) =
        showToast(context, context.getString(R.string.admin_receiver_status_enabled))

    fun onDisableRequested(context: Context, intent: Intent): CharSequence =
        context.getString(R.string.admin_receiver_status_disable_warning)

    fun onDisabled(context: Context, intent: Intent) =
        showToast(context, context.getString(R.string.admin_receiver_status_disabled))

    fun onPasswordChanged(context: Context, intent: Intent, userHandle: UserHandle) =
        showToast(context, context.getString(R.string.admin_receiver_status_pw_changed))

}
