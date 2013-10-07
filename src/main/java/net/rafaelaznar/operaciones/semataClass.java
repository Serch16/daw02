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
 * @version 1.0 Fecha 02-10-2013 02:18h
 */
public class semataClass {

    /**
     * Declaración de variables
     */
    private String nombre = "Sergio";
    private String apelluno = "Martín";
    private String apelldos = "Tárraga";

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
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene el primer apellido
     *
     * @return apelluno
     */
    public String getApelluno() {
        return apelluno;
    }

    /**
     * Método que establece el primer apellido
     *
     * @param apelluno
     */
    public void setApelluno(String apelluno) {
        this.apelluno = apelluno;
    }

    /**
     * Método que obtiene el segundo apellido
     *
     * @return apelldos
     */
    public String getApelldos() {
        return apelldos;
    }

    /**
     * Método que establece el segundo apellido
     *
     * @param apelldos
     */
    public void setApelldos(String apelldos) {
        this.apelldos = apelldos;
    }
    /**
     * Método que obtiene el nombre completo bien formateado con espacios
     * @return nombre + " " + apelluno + " " + apelldos
     */
    public String getNombreApellunoApelldos() {
        return nombre + " " + apelluno + " " + apelldos;
    }
    /**
     * Método que obtiene la referencia a este objeto
     * @return Esta clase (semataClass)
     */
    public semataClass getReference() {
        return this;
    }
}
