package com.example.news_app

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation


class MainActivity : AppCompatActivity() {
    private var navController: NavController? = null
    private val viewModel: MyViewModel by viewModels {MyViewModel.Factory}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    }
}