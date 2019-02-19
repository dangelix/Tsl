package com.tikal.cacao.dao.impl;

import java.util.List;

import com.tikal.cacao.dao.SerialDAO;
import com.tikal.cacao.model.Serial;
import static com.googlecode.objectify.ObjectifyService.ofy;

public class SerialDAOImp implements SerialDAO{

	@Override
	public void guardar(Serial s) {
		s.setId(s.getRfc()+s.getSerie());
		ofy().save().entity(s).now();
	}

	@Override
	public Serial consultar(String rfc, String serie) {
		return ofy().load().type(Serial.class).id(rfc+serie).now();
	}

	@Override
	public List<Serial> consultar(String rfc) {
		return ofy().load().type(Serial.class).filter("rfc",rfc).list();
	}

	@Override
	public List<Serial> consultarE(String rfc, String serial) {
		List<Serial> todos= ofy().load().type(Serial.class).filter("rfc",rfc).list();
		for(Serial s:todos){
			System.out.println("serie"+s.getSerie());
			if(s.getSerie()==serial){
				todos.remove(s);
			}
		}
		return todos;
	}
	
}
