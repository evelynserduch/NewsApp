package com.example.news_app

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class RegistrationFragment : Fragment(R.layout.fragment_registration) {
    private val viewModel: RegistrationViewModel by viewModels { RegistrationViewModel.Factory }
}