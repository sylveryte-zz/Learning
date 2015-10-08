import java.awt.*;
import javax.sound.midi.*;

class Engine  
{
	Sequencer player;
	Sequence seq;
	Track track;

	Engine()
	{
		init();
	}

	void init()
	{
		//get player
		// try
		// {
		// 	Sequencer player=MidiSystem.getSequencer();
		// 	player.open();
		// 	Sequence seq = new Sequence(Sequence.PPQ, 4);
		// 	Track track=seq.createTrack();
		// }catch(Exception e){}
		// System.out.println("iniation success");
	}

	void play(int i)
	{
		try
		{

			Sequencer player=MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track=seq.createTrack();

			player.setSequence(seq);
			player.start();
				
			System.out.println("noting "+i);	
		//note on
		ShortMessage a=new ShortMessage();
		a.setMessage(144,3,i,100);
		MidiEvent noteOn=new MidiEvent(a,i);
		track.add(noteOn);
	
			System.out.println("note on "+i);	

		//note off
		ShortMessage b=new ShortMessage();
		b.setMessage(128,3,i,100);
		MidiEvent noteOff=new MidiEvent(b,i+2);
		track.add(noteOff);

			
		}catch (Exception e) {
			
		}
	}
}

class KeyboardPiano 
{
	public static void main(String[] args) 
	{
		Engine en=new Engine();

		for (int i=60; i<70	;i++ ) 
		{
			en.play(i);
			try
			{
				Thread.sleep(500);
			}catch (Exception e) {
				
			}
		}	


	}
}
