package gameoflife;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlaygroundTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPlayground() {
		 boolean[][] initialCells = {{true,true},{false,true}};
	        Playground playground = new Playground(initialCells);
	        boolean[][][] goal = {{{true, false},{true, false}},{{false, false},{true, false}}};
	        assertThat(playground.getPlayground(),is(goal));
	}



}
