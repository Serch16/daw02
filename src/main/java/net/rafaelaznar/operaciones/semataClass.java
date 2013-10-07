/*
 * Copyright (C) 2013 Sergio Martín Tárraga
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
package net.rafaelaznar.operaciones;

/**
 *
 * @author Sergio Martín Tárraga
 * @version 1.0 Fecha 07-10-2013 02:18h
 */
public class semataClass {

    /**
     * Declaración de Variables.
     */
    private String nombre = "Sergio";
    private String apellido1 = "Martín";
    private String apellido2 = "Tárraga";

    /**
     * Método que obtiene el nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

  /**
   * Método que establece el nombre
   * @param nombre 
   */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene el primer apellido
     *
     * @return Apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Método que establece el primer apellido
     *
     * @return Apellido2
     */
    public void setApellido1(String apellido) {
        this.apellido1 = apellido1;
    }

    /**
     * Método que obtiene el apellido2
     *
     * @return Apellido2
     */
    public String getApellido2() {
        return apellido1;
    }

    /**
     * Método que establece el apellido
     *
     * @return Apellido2
     */
    public void setApellido2(String apellido) {
        this.apellido2 = apellido2;
    }

    /**
     * Método que devuelve el nombre, el primer apellido y el segundo apellido
     * bien formateados
     *
     * @return nombre + apellido1 + apellido2
     */
    public String getNombreApellidos() {
        return nombre + " " + apellido1;
    }

    /**
     * Para obtener la referencia a este objeto
     *
     * @return referencia al objeto
     */
    public semataClass getReference() {
        return this;
    }
}