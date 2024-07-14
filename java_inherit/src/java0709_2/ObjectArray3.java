package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findByAll();
		
		for( Board board : list) { // title�� Ư�� ���ڳ� ���ڿ� ����
			if( board.getTitle().contains("��")  ) {
				System.out.println( board );
			}
		}
		
		// hit���� 50 �̻��� �� ���
		for( Board board : list) {
			if( board.getHit() >= 50 ) {
				System.out.println( board );
			}
		}
		
		// ������ ���ڼ��� 10�� �̻��ΰ͸� ���
		System.out.println("\n������ ���ڼ��� 10�� �̻��ΰ͸� ���");
		for( Board board : list) {
			if(board.getTitle().length() >= 10) {
				System.out.println( board );
			}
		}
		
		// content�� ���ڼ��� 10�� ������ ��ü��
		// title�� writer�� ���
		System.out.println("\n content�� ���ڼ��� 10�� ������ ��ü��\r\n"
				+ "title�� writer�� ��� \n");
		
		for(Board board: list) {
			if( board.getContent().length() <= 10) {
				System.out.println( board.getTitle() + " "+board.getWriter());
			}
		}
		
		System.out.println("\n hit���� 100�̻��� ��ü���� �����Ͽ� hot �迭������");
		Board[] hot = new Board[ list.length ];
		
		int i=0; // hot �迭 �ε���
		for( Board board : list) {
			if( board.getHit() >= 100 ) {
				hot[i++] = board;
			}
		}
		for( Board data : hot ) {
			if( data == null) break;
			System.out.println( data );
		}
		
		// writer�� ���� ���Ե� ��ü �� �����Ͽ�
		// sin �迭�� ������ ����ϼ���
		
		Board[] sin = new Board[ list.length ];
		i=0;
		for(Board obj : list) {
			if( obj.getWriter().contains("��") ) {
				sin[i++] = obj;
			}
		}
		
		for( Board obj : sin) {
			if(obj == null) break;
			System.out.println( obj );
		}
		
	}

}