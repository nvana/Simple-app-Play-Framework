package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreRomain {
    @Required
    public String valeur;
    public NombreRomain() {}
    public NombreRomain(String r) {
	this.valeur = r;
    }

    public int en_decimal() {
	return 0;
    }
}
