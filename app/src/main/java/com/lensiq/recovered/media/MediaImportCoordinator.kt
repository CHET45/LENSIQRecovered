package com.lensiq.recovered.media

import android.content.Context

object MediaImportCoordinator {
    fun startImport(context: Context) {
        // Restored behavior point: check BLE state, battery, recording state, then import thumbnails/files over P2P Wi-Fi.
    }
    fun saveSelectedToGallery(ids: List<String>) {}
    fun deleteSelected(ids: List<String>) {}
}
