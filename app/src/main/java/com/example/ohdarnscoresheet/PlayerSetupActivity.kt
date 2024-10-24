package com.example.ohdarnscoresheet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ohdarnscoresheet.databinding.ActivityPlayerSetupBinding

class PlayerSetupActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayerSetupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPlayerSetupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up the button listener for confirming the number of players
        binding.btnConfirmPlayers.setOnClickListener {
            // Get the number of players from user input (e.g., EditText)
            val numberOfPlayers = binding.etNumberOfPlayers.text.toString().toIntOrNull() ?: 0
            // Logic to handle number of players (e.g., start a new game with the specified number)
        }
    }
}
