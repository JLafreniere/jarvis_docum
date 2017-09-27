package jarvis.atoms.primitives;

import java.util.ArrayList;

import jarvis.atoms.AbstractAtom;
import jarvis.atoms.IntAtom;
import jarvis.atoms.ListAtom;
import jarvis.atoms.ObjectAtom;
import jarvis.atoms.StringAtom;
import jarvis.interpreter.JarvisInterpreter;

public class OperatorSetPrimitive extends PrimitiveOperationAtom {
	
	protected void init() {
		argCount = 2;
	}
	
	@Override
	protected AbstractAtom execute(JarvisInterpreter ji,ObjectAtom self) {	
		
		//d�pile pour prendre les 2 argument apr�s le set 
		
		AbstractAtom attribute = ji.getArg();
		AbstractAtom newValue = ji.getArg();
		self.setValue(attribute,newValue);
		
		return newValue;		
		
	}

	@Override
	public String makeKey() {
		
		return "OperatorSetPrimitive";
	}
	

}
