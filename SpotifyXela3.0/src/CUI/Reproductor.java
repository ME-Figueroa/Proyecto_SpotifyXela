package CUI;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel; // Necesario para inicializar JavaFX en aplicaciones Swing/AWT
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Reproductor extends javax.swing.JFrame {

    private MediaPlayer mediaPlayer;
    private List<String> playlist = new ArrayList<>();
    private int currentIndex = 0;
    private String filepath;
    private String musicFolderPath = "\"C:\\Users\\personal\\Music\"";

   
    public Reproductor() {
        initComponents();
        new JFXPanel();
        loadSongsFromFolder(new File(musicFolderPath));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnStop = new javax.swing.JButton();
        BtnPlay = new javax.swing.JButton();
        BtnCnt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        songList = new javax.swing.JList<>();
        BtnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnStop.setBackground(new java.awt.Color(38, 72, 159));
        BtnStop.setIcon(new javax.swing.ImageIcon("C:\\Users\\personal\\Documents\\GitHub\\Proyecto_SpotifyXela\\Spotify_Xela\\Iconos\\boton-detener.png")); // NOI18N
        BtnStop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStopActionPerformed(evt);
            }
        });
        jPanel1.add(BtnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 120, 60));

        BtnPlay.setBackground(new java.awt.Color(54, 65, 147));
        BtnPlay.setIcon(new javax.swing.ImageIcon("C:\\Users\\personal\\Documents\\GitHub\\Proyecto_SpotifyXela\\Spotify_Xela\\Iconos\\boton-de-play.png")); // NOI18N
        BtnPlay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlayActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 120, 60));

        BtnCnt.setBackground(new java.awt.Color(89, 84, 151));
        BtnCnt.setIcon(new javax.swing.ImageIcon("C:\\Users\\personal\\Documents\\GitHub\\Proyecto_SpotifyXela\\Spotify_Xela\\Iconos\\boton-de-pausa-de-video.png")); // NOI18N
        BtnCnt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCntActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 120, 60));

        songList.setBackground(new java.awt.Color(162, 152, 176));
        songList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(songList);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 208, 168));

        BtnNext.setBackground(new java.awt.Color(31, 86, 168));
        BtnNext.setIcon(new javax.swing.ImageIcon("C:\\Users\\personal\\Documents\\GitHub\\Proyecto_SpotifyXela\\Spotify_Xela\\Iconos\\proximo.png")); // NOI18N
        BtnNext.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 150, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    private void BtnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlayActionPerformed
        if (!playlist.isEmpty()) {
            playMusic(playlist.get(currentIndex));
            songList.setSelectedIndex(currentIndex);
        } else {
            JOptionPane.showMessageDialog(this, "No hay canciones en la lista de reproducción.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BtnPlayActionPerformed

    private void BtnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStopActionPerformed
    if (mediaPlayer != null) {
            Platform.runLater(() -> mediaPlayer.pause());
        }
    }//GEN-LAST:event_BtnStopActionPerformed

    private void BtnCntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCntActionPerformed
    if (mediaPlayer != null) {
            Platform.runLater(() -> mediaPlayer.play());
        }
    }//GEN-LAST:event_BtnCntActionPerformed

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
        if (!playlist.isEmpty()) {
            if (currentIndex < playlist.size() - 1) {
                currentIndex++;
                playMusic(playlist.get(currentIndex));
                songList.setSelectedIndex(currentIndex);
            } else {
                JOptionPane.showMessageDialog(this, "Has alcanzado el final de la lista de reproducción.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay canciones en la lista de reproducción.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BtnNextActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reproductor().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCnt;
    private javax.swing.JButton BtnNext;
    private javax.swing.JButton BtnPlay;
    private javax.swing.JButton BtnStop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> songList;
    // End of variables declaration//GEN-END:variables

   
private void loadSongsFromFolder(File folder) {
    // Limpiar la lista actual
    playlist.clear();
    currentIndex = 0;

    // Filtrar archivos de audio soportados (.mp3 y .wav)
    File[] files = folder.listFiles((dir, name) -> {
        String lower = name.toLowerCase();
        return lower.endsWith(".mp3") || lower.endsWith(".wav");
    });

    if (files != null && files.length > 0) {
        for (File file : files) {
            playlist.add(file.getAbsolutePath());
        }
        // Actualizar la JList con los nombres de las canciones
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String song : playlist) {
            listModel.addElement(new File(song).getName());
        }
        songList.setModel(listModel);
        JOptionPane.showMessageDialog(this, "Se han cargado " + playlist.size() + " canciones.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron archivos de audio en la carpeta especificada.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
}
    
    public void playMusic(String filepath) {
        try {
            File musicFile = new File(filepath);

            // Verifica que el archivo existe
            if (!musicFile.exists()) {
                JOptionPane.showMessageDialog(this, "El archivo de audio no existe: " + filepath, "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crea la instancia de Media usando la URI del archivo
            Media media = new Media(musicFile.toURI().toString());

            // Ejecuta en el hilo de JavaFX
            Platform.runLater(() -> {
                // Si ya hay una reproducción en curso, deténla
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
                // Crea un nuevo MediaPlayer y reproduce el audio
                mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
            });

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al reproducir el audio.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }


}
