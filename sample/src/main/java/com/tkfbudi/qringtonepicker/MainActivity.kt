package com.tkfbudi.qringtonepicker

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.tkfbudi.ringtone.QRingtone
import com.tkfbudi.ringtone.QRingtoneListener
import com.tkfbudi.ringtone.Ringtone
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var currentRingtone: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShow.setOnClickListener { showDialog() }
    }

    fun showDialog() {
        QRingtone(this)
                .setFragmentManager(supportFragmentManager)
                .setTitle("Ringtone Picker")
                .isPlayable(true)
                .setNegativeButton("Cancel")
                .setPositiveButton("Ok")
                .setCurrentRingtone(currentRingtone)
                .setRingtoneListener(object : QRingtoneListener {
                    override fun onItemRingtoneSelected(ringtone: Ringtone) {
                        Toast.makeText(this@MainActivity, ringtone.name, Toast.LENGTH_SHORT).show()
                        currentRingtone = ringtone.uri.toString()
                    }

                })
                .show()
    }
}
