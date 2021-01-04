package com.bootcamp.dslearn.observers;

import com.bootcamp.dslearn.entities.Deliver;

public interface DeliverRevisionObserver {

	void onSaveRevision(Deliver deliver);
	
}
