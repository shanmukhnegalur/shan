package dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import dao.Student;

public class Sample {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();


public void insert(Student std){
	entityTransaction.begin();
	entityManager.persist(std);
	entityTransaction.commit();
}

public void update(int stdid,String stdname){
	Student e=entityManager.find(Student.class, stdid);
	e.setStdname(stdname);
	entityTransaction.begin();
	entityManager.merge(e);
	entityTransaction.commit();
	
}
public void remove(int stdid){
	Student e=entityManager.find(Student.class, stdid);
	entityTransaction.begin();
	entityManager.remove(e);
	entityTransaction.commit();
}
public String fetch(int stdid){
	Student e=entityManager.find(Student.class, stdid);
//	System.out.println(e);
	return "data fetched "+ e;
}
//public void fetchAll(){
//	javax.persistence.Query e= entityManager.createQuery("select a from student08 a");
//	List<Student> l=e.getResultList();
//	for(Student s:l){
//		System.out.println(s);
//	}
//	
//}
}
