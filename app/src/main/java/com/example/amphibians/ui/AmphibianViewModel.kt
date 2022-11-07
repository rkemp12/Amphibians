/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.amphibians.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.amphibians.network.Amphibian
import kotlinx.coroutines.launch

enum class AmphibianApiStatus {LOADING, ERROR, DONE}

class AmphibianViewModel : ViewModel() {

    // TODO: Create properties to represent MutableLiveData and LiveData for the API status

    // TODO: Create properties to represent MutableLiveData and LiveData for a list of amphibian objects

    // TODO: Create properties to represent MutableLiveData and LiveData for a single amphibian object.
    //  This will be used to display the details of an amphibian when a list item is clicked

    // TODO: Create a function that gets a list of amphibians from the api service and sets the
    //  status via a Coroutine
//    private fun getAmphibian() {
//
//        viewModelScope.launch {
//            _status.value = MarsApiStatus.LOADING
//            try {
//                _photos.value = MarsApi.retrofitService.getPhotos()
//                _status.value = MarsApiStatus.DONE
//            } catch (e: Exception) {
//                _status.value = MarsApiStatus.ERROR
//                _photos.value = listOf()
//            }
//        }
//    }

    fun onAmphibianClicked(amphibian: Amphibian) {
        // TODO: Set the amphibian object
    }
}
