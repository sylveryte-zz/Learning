import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiSystem;

/*
 *	Mini Project Java
 *		by Sandeep Sahani & Sejal Bansal
 *
 */

class SoundEngine  
{
	Synthesizer s;
	MidiChannel[] mc;
	Instrument[] in;
	boolean b;
	int NOTEOFFDELAY=900;
	int NOTEONVOL=200;

	SoundEngine()
	{
	try
		{
			s=MidiSystem.getSynthesizer();
			s.open();
			mc=s.getChannels();
			in=s.getDefaultSoundbank().getInstruments();
			b=s.loadInstrument(in[6]);
		}catch (Exception e) {	}
	}

	// boolean setInst(int i)
	// {
	// 	b=s.loadInstrument(in[i]);
	// 	return b;
	// }

	void playOn(int channel,int note)
	{
		mc[channel].noteOn(note,NOTEONVOL);
	}

	void playOff(int channel,int note)
	{
		mc[channel].noteOff(note,NOTEOFFDELAY);
	}
}
