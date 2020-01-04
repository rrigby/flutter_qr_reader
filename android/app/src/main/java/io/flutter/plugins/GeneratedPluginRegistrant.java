package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import me.hetian.flutter_qr_reader.FlutterQrReaderPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterQrReaderPlugin.registerWith(registry.registrarFor("me.hetian.flutter_qr_reader.FlutterQrReaderPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
