package com.example.profile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.profile.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.backbtn.setOnClickListener{
            finish()
        }
        binding.linkedin.setOnClickListener{
            val linkedinLauncher = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/khaled-elalfy-b29043252/"))
            startActivity(linkedinLauncher)
        }
        binding.facebook.setOnClickListener{
            val facebookLauncher=Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/khaled.alfy.18"))
            startActivity(facebookLauncher)
        }
        binding.github.setOnClickListener{
            val githubLauncher=Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/KhaledElalfy1"))
            startActivity(githubLauncher)
        }
    }
}