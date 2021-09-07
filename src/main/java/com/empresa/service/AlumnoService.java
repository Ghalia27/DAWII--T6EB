package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Alumno;

public interface AlumnoService {

	public abstract Alumno insertaActualizaAlumno(Alumno obj);
	public abstract List<Alumno> listaAlumno();
	public abstract Optional<Alumno> obtenerPorId(int idAlumno);
	public abstract void eliminaPorId(int idAlumno);
	public abstract List<Alumno> listaPorDni(String dni);
}
