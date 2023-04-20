/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import info5100.university.example.Campus.Building;
import info5100.university.example.Campus.Campus;
import info5100.university.example.Campus.Classroom;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Pinocchio
 */
public class CampusTest {
   private Campus campus;
   private Building building1;
   private Building building2;
   private Classroom classroom1;
   private Classroom classroom2;

   @Before
   public void setUp() {
      this.campus = new Campus("Test Campus");
      this.building1 = new Building("Building 1");
      this.building2 = new Building("Building 2");
      this.classroom1 = new Classroom("Classroom 1", 30);
      this.classroom2 = new Classroom("Classroom 2", 20);
   }

   @Test
   public void testAddBuilding() {
      this.campus.addBuilding(this.building1);
      Assert.assertTrue(this.campus.getBuildings().contains(this.building1));
   }

   @Test
   public void testAddClassroom() {
      throw new Error("Unresolved compilation problem: \n\tThe method addClassroom(Classroom) in the type Building is not applicable for the arguments (Classroom, int)\n");
   }

   @Test
   public void testGetCapacity() {
      throw new Error("Unresolved compilation problems: \n\tThe method addClassroom(Classroom) in the type Building is not applicable for the arguments (Classroom, int)\n\tThe method addClassroom(Classroom) in the type Building is not applicable for the arguments (Classroom, int)\n\tThe method getCapacity() is undefined for the type Building\n");
   }

   @Test
   public void testGetAvailableClassrooms() {
      throw new Error("Unresolved compilation problems: \n\tThe method addClassroom(Classroom) in the type Building is not applicable for the arguments (Classroom, int)\n\tThe method addClassroom(Classroom) in the type Building is not applicable for the arguments (Classroom, int)\n");
   }

   @Test
   public void testGetAllClassrooms() {
      throw new Error("Unresolved compilation problems: \n\tThe method addClassroom(Classroom) in the type Building is not applicable for the arguments (Classroom, int)\n\tThe method addClassroom(Classroom) in the type Building is not applicable for the arguments (Classroom, int)\n\tThe method getAllClassrooms() is undefined for the type Campus\n");
   }
}

