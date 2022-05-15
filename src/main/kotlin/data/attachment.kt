package data.service.data

sealed class Attachment

data class AttachmentAudio(val audioName: String) : Attachment()

data class AttachmentDocument(val documentName: String) : Attachment()

data class AttachmentLink(val linkName: String) : Attachment()

data class AttachmentNote(val noteName: String) : Attachment()

data class AttachmentPage(val pageName: String) : Attachment()
