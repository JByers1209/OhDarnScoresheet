package com.example.ohdarnscoresheet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ohdarnscoresheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set the title text programmatically
        binding.tvAppTitle.text = "Oh Darn! Scoresheet"

        // Set up the button listeners
        binding.btnStartGame.setOnClickListener {
            startNewGame()
        }

        binding.btnPreviousGames.setOnClickListener {
            showPreviousGames()
        }
    }

    private fun startNewGame() {
        // Create an intent to launch PlayerSetupActivity
        val intent = Intent(this, PlayerSetupActivity::class.java)
        startActivity(intent)
    }

    private fun showPreviousGames() {
        // Logic to show previous games (to be implemented)
    }

    companion object {
        init {
            System.loadLibrary("ohdarnscoresheet")
        }
    }
}
