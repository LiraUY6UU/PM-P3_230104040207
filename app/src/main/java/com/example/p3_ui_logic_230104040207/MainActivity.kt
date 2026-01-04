package com.example.p3_ui_logic_230104040207

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtName = findViewById<EditText>(R.id.edtName)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtUmur = findViewById<EditText>(R.id.edtUmur)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        // Dynamic form
        val containerHobi = findViewById<LinearLayout>(R.id.containerHobi)
        val btnAddHobi = findViewById<Button>(R.id.btnAddHobi)

        // Counter
        val txtCounter = findViewById<TextView>(R.id.txtCounter)
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        var counter = 0

        // Switch theme
        val switchTheme = findViewById<Switch>(R.id.switchTheme)
        val rootLayout = findViewById<ConstraintLayout>(R.id.rootLayout)

        // --- Dynamic Add Hobi ---
        btnAddHobi.setOnClickListener {
            val newHobi = EditText(this)
            newHobi.hint = "Masukkan Hobi"
            containerHobi.addView(newHobi)
        }

        // --- Counter logic ---
        btnPlus.setOnClickListener {
            counter++
            txtCounter.text = counter.toString()
        }
        btnMinus.setOnClickListener {
            if (counter > 0) counter--
            txtCounter.text = counter.toString()
        }

        // --- Switch Theme ---
        switchTheme.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                rootLayout.setBackgroundColor(Color.BLACK)
                txtResult.setTextColor(Color.WHITE)
                txtCounter.setTextColor(Color.WHITE)
            } else {
                rootLayout.setBackgroundColor(Color.WHITE)
                txtResult.setTextColor(Color.BLACK)
                txtCounter.setTextColor(Color.BLACK)
            }
        }

        // --- Submit logic with validation ---
        btnSubmit.setOnClickListener {
            val name = edtName.text.toString().trim()
            val email = edtEmail.text.toString().trim()
            val umurStr = edtUmur.text.toString().trim()

            if (name.isEmpty()) {
                edtName.error = "Nama tidak boleh kosong!"
                return@setOnClickListener
            }
            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                edtEmail.error = "Email tidak valid!"
                return@setOnClickListener
            }
            val umur = umurStr.toIntOrNull()
            if (umur == null || umur !in 1..120) {
                edtUmur.error = "Umur harus 1-120"
                return@setOnClickListener
            }

            // Ambil semua hobi
            val hobbies = mutableListOf<String>()
            for (i in 0 until containerHobi.childCount) {
                val edt = containerHobi.getChildAt(i) as EditText
                if (edt.text.isNotEmpty()) hobbies.add(edt.text.toString())
            }

            txtResult.text = "Halo $name, umurmu $umur, email kamu $email\n" +
                    "Hobi: ${if (hobbies.isEmpty()) "-" else hobbies.joinToString(", ")}"
            txtResult.setTextColor(Color.BLUE)

            Toast.makeText(this, "Input diterima", Toast.LENGTH_SHORT).show()
        }
    }
}
