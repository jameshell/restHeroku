/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sergioArboleda.facade;

/**
 *
 * @author james
 */
public class ExamFacade extends ServiceImpl<Exam>{
        public StudentFacade() throws ConexionException {
        super(Student.class);
        try{
             EntityManager em = SingletonConnection.getConnection();
            super.setEntityManager(em);
        }catch(Exception e){
            e.printStackTrace();
           throw new ConexionException("Problemas en la realizacion de conexion con la base de datos");
        }
    }
    
    @Override
    public List<Student> findAll() {
        return super.findAll();
    }
}
