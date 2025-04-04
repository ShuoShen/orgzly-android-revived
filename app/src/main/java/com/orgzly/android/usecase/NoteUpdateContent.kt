package com.orgzly.android.usecase

import com.orgzly.android.data.DataRepository

/**
 * From toggling checkboxes, folding drawers, etc.
 */
class NoteUpdateContent(val noteId: Long, val content: String?) : UseCase() {
    override fun run(dataRepository: DataRepository): UseCaseResult {
        dataRepository.updateNoteContent(noteId, content)

        return UseCaseResult(
                modifiesLocalData = true,
                triggersSync = SYNC_DATA_MODIFIED
        )
    }
}