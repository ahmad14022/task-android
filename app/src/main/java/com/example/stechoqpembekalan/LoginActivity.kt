package com.example.stechoqpembekalan

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.RequestQueue
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var dataAdapter: DataAdapter
    private lateinit var requestQueue: RequestQueue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        recyclerView = findViewById(R.id.dataRecyclerView)
        dataAdapter = DataAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = dataAdapter

        requestQueue = Volley.newRequestQueue(this)

        val loginButton: Button = findViewById(R.id.loginButton)
        val registerButton: Button = findViewById(R.id.registerButton)
        val usernameEditText: EditText = findViewById(R.id.usernameEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)

        val authManager = AuthManager(this) // Pastikan Anda telah membuat AuthManager dengan benar

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (authManager.authenticate(username, password)) {
                // Login success
                Toast.makeText(this, "Login berhasil", Toast.LENGTH_SHORT).show()

                fetchDataFromApi()
            } else {
                // Login failed
                Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show()
            }
        }

        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun fetchDataFromApi() {
        val url = "https://jsonplaceholder.typicode.com/photos"
        val jsonArrayRequest = JsonArrayRequest(
            Request.Method.GET, url, null,
            Response.Listener { response ->
                parseJsonResponse(response)
            },
            Response.ErrorListener { error ->
                error.printStackTrace()
            }
        )
        requestQueue.add(jsonArrayRequest)
    }

    private fun parseJsonResponse(response: JSONArray) {
        val dataList = mutableListOf<DataModel>()

        for (i in 0 until response.length()) {
            val jsonObject = response.getJSONObject(i)
            val id = jsonObject.getInt("id")
            val title = jsonObject.getString("title")

            dataList.add(DataModel(id, title))
        }

        dataAdapter.setData(dataList)
    }
}
