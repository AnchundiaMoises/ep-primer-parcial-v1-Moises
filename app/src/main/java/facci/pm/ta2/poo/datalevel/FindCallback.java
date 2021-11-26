package facci.pm.ta2.poo.datalevel;

import java.util.ArrayList;

/**
 * Created by Salva on 06/02/2016.
 */
public interface FindCallback<DataObject> {
    public void done(ArrayList<DataObject> objects, DataException e);
}
