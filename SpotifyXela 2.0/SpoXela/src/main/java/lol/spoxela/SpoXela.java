package lol.spoxela;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel; // Necesario para inicializar JavaFX en aplicaciones Swing/AWT
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
import java.io.File;

public class SpoXela {

    private static MediaPlayer mediaPlayer;

    public static void main(String[] args) {
        System.out.println("Iniciando reproducción de audio...");

        // Inicializa JavaFX
        new JFXPanel(); // Necesario para inicializar el toolkit de JavaFX

        // Ruta al archivo de audio
        String filepath = "\"D:\\Moises\\Documentos\\NetBeansProjects\\SpoXela\\src\\main\\java\\lol\\spoxela\\Musica\\Leiti Sene - SpanishPassionFeet.opus\\"; // Reemplaza con la ruta real

        // Reproduce la música
        playMusic(filepath);

        // Maneja las interacciones del usuario para pausar, reanudar y detener
        handleUserInteractions();

        System.out.println("Finalizando aplicación.");
        System.exit(0);
    }

    public static void playMusic(String filepath) {
        try {
            File musicFile = new File(filepath);

            // Verifica que el archivo existe
            if (!musicFile.exists()) {
                JOptionPane.showMessageDialog(null, "El archivo de audio no existe: " + filepath, "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crea la instancia de Media usando la URI del archivo
            Media media = new Media(musicFile.toURI().toString());

            // Crea el MediaPlayer y reproduce el audio en el hilo de JavaFX
            Platform.runLater(() -> {
                mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
            });

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al reproducir el audio.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public static void handleUserInteractions() {
        // Pausar la reproducción
        int pauseOption = JOptionPane.showConfirmDialog(null, "¿Desea pausar la música?", "Control de Reproducción", JOptionPane.YES_NO_OPTION);
        if (pauseOption == JOptionPane.YES_OPTION && mediaPlayer != null) {
            Platform.runLater(() -> mediaPlayer.pause());
            JOptionPane.showMessageDialog(null, "La música ha sido pausada.");
        }

        // Reanudar la reproducción
        int resumeOption = JOptionPane.showConfirmDialog(null, "¿Desea reanudar la música?", "Control de Reproducción", JOptionPane.YES_NO_OPTION);
        if (resumeOption == JOptionPane.YES_OPTION && mediaPlayer != null) {
            Platform.runLater(() -> mediaPlayer.play());
            JOptionPane.showMessageDialog(null, "La música ha sido reanudada.");
        }

        // Detener la reproducción
        int stopOption = JOptionPane.showConfirmDialog(null, "¿Desea detener la música?", "Control de Reproducción", JOptionPane.YES_NO_OPTION);
        if (stopOption == JOptionPane.YES_OPTION && mediaPlayer != null) {
            Platform.runLater(() -> mediaPlayer.stop());
            JOptionPane.showMessageDialog(null, "La música ha sido detenida.");
        }
    }
}
