package Basic;

public class NoteCount {
	public static void main(String[] args) {
		int note[]= {500,200,100,50,20,10,5,2,1};
		int count=0;
		int many=2458;
		for (int i = 0; i < note.length; i++) {
			count=many/note[i];
			if(count>0) {
				System.out.println(note[i]+"==="+count);
			}
			many=many%note[i];
		}
	}

}
