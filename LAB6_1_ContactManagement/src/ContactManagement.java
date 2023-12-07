import java.util.ArrayList;

public class ContactManagement {
	ArrayList<Contact> listContact = new ArrayList<>();
	Inputter i = new Inputter();
	public void addContact() {
		int newId = returnCorrectID();
		String newFullName = i.inputNotBlank("Nhập tên liên hệ");
		String newGroup = i.inputNotBlank("Nhập nhóm liên hệ");
		String newAddress = i.inputNotBlank("Nhập địa chỉ liên hệ");
		String newPhone = i.inputPattern("Nhập số điện thoại liên hệ", "[0-9]{10}|[0-9\\s.-]{12,13}[\\w]*|[(0-9)]{5}[0-9-]{9}");
		Contact newContact = new Contact(newId, newFullName, newGroup, newAddress, newPhone);
		this.listContact.add(newContact);
		System.out.println("Thêm liên hệ mới thành công!");
	}
	
	public void displayAll() {
		for (Contact contact : listContact) {
			System.out.println(contact);
		}
	}
	
	public void deleteContact() {
		int deleteId = i.inputNumber("Nhập id cần xóa", 1, Integer.MAX_VALUE);
		for (Contact contact : listContact) {
			if (deleteId==contact.getId()) {
				this.listContact.remove(contact);
				System.out.println("Xóa thành công!");
				return;
			}
		}
	}
	
	public int returnCorrectID() {
		if(!this.listContact.isEmpty()) {
			Contact lastContact = this.listContact.get(this.listContact.size()-1);
			int correctId = lastContact.getId()+1;
			return correctId;
		}
		return 1;
	}
	
	
	
	
}
