/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bellaire.aerbot.systems;

/**
 *
 * @author Agro
 */

import edu.wpi.first.wpilibj.camera.AxisCamera;
import edu.wpi.first.wpilibj.camera.AxisCameraException;
import edu.wpi.first.wpilibj.image.ColorImage;
import edu.wpi.first.wpilibj.image.NIVisionException;


public class CameraSystem implements RobotSystem {

    private AxisCamera camera;
    
    public void init() {
        camera = AxisCamera.getInstance();
    }

    public void destroy() {
        
    }
    
    public ColorImage getImage(){
        ColorImage image = null;
        try{
            image = camera.getImage();
        }catch (AxisCameraException ex){
            
        }catch (NIVisionException ex){
            
        }
        return image;
    }
}

