/*
 * Copyright (C) 2013 Rafael Aznar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.rafaelaznar.tests;

import net.rafaelaznar.operaciones.semataClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio Martín Tárraga
 * @version 1.0
 * Fecha 07-10-13 03:16h
 */
class semataClassTest {

    public semataClassTest() {
        System.out.println("NewEmptyJUnitTest");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("beforeClass-setUpClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("afterClass-tearDownClass");
    }

    @Before
    public void setUp() {
        System.out.println("before-setUp");

    }

    @After
    public void tearDown() {
        System.out.println("after-tearDown");
    }
    
    @Test
    public void testGetNombreApellunoApelldos() {
        System.out.println("test: GetNombreApellunoApelldos()");
        semataClass oSemata = new semataClass();
        asserNotNull("objeto semata creado", oSemata);
        asserEquals("getNombre: Debe devolver Sergio", oSemata.getNombre(), "Sergio");
        assertTrue("getApelluno: Debe devolver Martín", "Martín".equals(oSemata.getApelluno()));
        assertTrue("getApelluno: Debe devolver Tárraga", "Tárraga".equals(oSemata.getApelldos()));
        if (!oSemata.getNombre().equals("Sergio")) {
            fail("getNombre: Nombre distinto de Sergio");
        }
        if (!oSemata.getApelluno().equals("Martín")) {
            fail("getApelluno: Primer apellido distinto de Martín");
        }
        if (!oSemata.getApelldos().equals("Tárraga")) {
            fail("getApelldos: Segundo apellido distinto de Tárraga");
        }
        assertSame("prueba getReference", oSemata, oSemata.getReference());
        semataClass oSemata2 = new semataClass();
        assertNotSame("No son el mismo nombre");
    }
}
