package com.ihh.hilt_sample_1

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SampleVM1 @Inject constructor(private val getUseCase: SampleUseCase1) : ViewModel() {

    fun getStr(): String {
        return getUseCase.invoke()
    }
}