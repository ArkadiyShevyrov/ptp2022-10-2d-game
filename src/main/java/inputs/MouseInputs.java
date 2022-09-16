package inputs;

import gamestates.EnumGameState;
import main.GamePanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {

    private final GamePanel gamePanel;
    private float scale;

    public MouseInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        this.scale = gamePanel.getGame().getScale();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch (EnumGameState.state) {
            case PLAYING:
            case MENU:
                gamePanel.getGame().getMenu().mouseClicked(e, scale);
                break;
            case QUIT:
            default:
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        switch (EnumGameState.state) {
            case PLAYING:
            case MENU:
                gamePanel.getGame().getMenu().mousePressed(e, scale);
                break;
            case QUIT:
            default:
                break;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        switch (EnumGameState.state) {
            case PLAYING:
            case MENU:
                gamePanel.getGame().getMenu().mouseReleased(e, scale);
                break;
            case QUIT:
            default:
                break;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        switch (EnumGameState.state) {
            case PLAYING:
            case MENU:
                gamePanel.getGame().getMenu().mouseDragged(e, scale);
                break;
            case QUIT:
            default:
                break;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        switch (EnumGameState.state) {
            case PLAYING:
            case MENU:
                gamePanel.getGame().getMenu().mouseMoved(e, scale);
                break;
            case QUIT:
            default:
                break;
        }
    }
}