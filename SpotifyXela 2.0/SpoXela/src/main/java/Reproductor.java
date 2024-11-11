import javafx.application.Platform;
import javafx.embed.swing.JFXPanel; // Necesario para inicializar JavaFX en aplicaciones Swing/AWT
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
import java.io.File;

public class Reproductor extends javax.swing.JFrame {

    private MediaPlayer mediaPlayer;
    private String filepath;
    
   
    public Reproductor() {
        initComponents();
        new JFXPanel();
        filepath = "D:\\Moises\\Documentos\\NetBeansProjects\\SpoXela\\src\\main\\java\\lol\\spoxela\\Musica\\ElevenLabs_Text_to_Speech_audio.mp3";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnStop = new javax.swing.JButton();
        BtnPlay = new javax.swing.JButton();
        BtnCnt = new javax.swing.JButton();
        BtnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");

        BtnStop.setText("Stop");
        BtnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStopActionPerformed(evt);
            }
        });

        BtnPlay.setText("Play");
        BtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlayActionPerformed(evt);
            }
        });

        BtnCnt.setText("Continue");
        BtnCnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCntActionPerformed(evt);
            }
        });

        BtnNext.setText("Next");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(BtnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(BtnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(BtnCnt)
                .addGap(54, 54, 54)
                .addComponent(BtnNext)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCnt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    private void BtnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlayActionPerformed
        playMusic(filepath);
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
    // End of variables declaration//GEN-END:variables

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
