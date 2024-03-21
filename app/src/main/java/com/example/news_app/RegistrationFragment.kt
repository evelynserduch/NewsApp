package com.example.news_app

import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class RegistrationFragment: Fragment(R.layout.fragment_registration) {
    private val viewModel: MyViewModel by viewModels {MyViewModel.Factory}
}