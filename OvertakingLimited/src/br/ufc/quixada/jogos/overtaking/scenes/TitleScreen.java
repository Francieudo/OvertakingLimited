package br.ufc.quixada.jogos.overtaking.scenes;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.types.CGPoint;

import static br.ufc.quixada.jogos.overtaking.configuracao.DeviceSettings.screenHeight;
import static br.ufc.quixada.jogos.overtaking.configuracao.DeviceSettings.screenWidth;
import static br.ufc.quixada.jogos.overtaking.configuracao.DeviceSettings.screenResolution;
public class TitleScreen extends CCLayer {

	private ScreenBackground background;
	
	public TitleScreen() {
		
		//background
		this.background = new ScreenBackground(Assets.BACKGROUND);
		this.background.setPosition(
				screenResolution(CGPoint.ccp(
				screenWidth() / 2.0f,
				screenHeight() / 2.0f)));
		this.addChild(this.background);
	}

	/*
	 *  prepara a tela para utilização e posicionamento dos elementos
	 */
	public CCScene scene(){
		CCScene scene = CCScene.node();
		scene.addChild(this);
		return scene;
	}
	
	
}
