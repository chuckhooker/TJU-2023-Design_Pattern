package facade;

public class BackUp {
	
	private PhotosManager photosManager = new PhotosManager();
	private SongsManager songsManager = new SongsManager();
	private MessagesManager messagesManager = new MessagesManager();
	private ContactsManager contactsManager = new ContactsManager();
	
	public void backUp() {
		photosManager.copy();
		photosManager.move();
		songsManager.copy();
		songsManager.move();
		messagesManager.copy();
		messagesManager.move();
		contactsManager.copy();
		contactsManager.move();
	}
	

}
