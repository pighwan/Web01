package mvcTest;

import java.util.List;

public class StudentService {
	// ** 전역변수 정의
	private StudentDAO dao = new StudentDAO();
	private StudentVO vo = new StudentVO();
	
	// ** Service 역할
	// Controller 의 요청을 처리한 후 결과를 제공
	public List<StudentVO> selectList() {
		 return dao.selectList();
	} //selectList
	
	public StudentVO selectOne(StudentVO vo) {
		return dao.selectOne(vo);
	} //selectOne
	
	// Insert
	public void insert() {
		vo.setIdno("123456-1234567");
		vo.setName("김그린");
		vo.setGender("여");
		vo.setAge(33);
		vo.setJava(88);
		vo.setHtml(77);
		// ** 필요하지 않으면 변수 count 를 반드시 선언할 필요는 없음 
		// => 일반적으로 update() 메서드 처럼 작성함.  
		int count = dao.insert(vo);
		if (count>0) { // insert 성공
			System.out.println("** Insert 성공 **");
		}else // insert 실패
			System.out.println("** Insert 실패 **");
	} //insert
	
	// Update
	// => name, java, html 수정
	public void update() {
		vo.setIdno("123456-1234567");
		vo.setName("박나라");
		vo.setJava(80);
		vo.setHtml(90);
		if ( dao.update(vo)>0 ) 
			 System.out.println("** Update 성공 **");
		else System.out.println("** Update 실패 **");
	} //update
	
	// Delete
	public void delete() {
		vo.setIdno("123456-1234567");
		if ( dao.delete(vo)>0 )
			 System.out.println("** Delete 성공 **");
		else System.out.println("** Delete 실패 **");
		
	} //delete

} //class
