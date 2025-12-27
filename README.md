# Zava-Socket-Sync

A lightweight, multithreaded peer-to-peer data router and synchronization system built entirely using Core Java (JDK). This project demonstrates low-level socket programming, multithreaded concurrency management, and custom communication protocols without the use of external frameworks.

## Features

- **Multithreaded Boss Router**: A central server (`VibeSarkar`) that handles concurrent client connections using thread-per-connection architecture.
- **Asynchronous Peer Clients**: Clients (`VibeBondhu`) utilize separate threads for non-blocking message listening and broadcasting.
- **Real-time Synchronization**: Instant data routing across all connected peers.
- **Global Utilities**: A dedicated utility system (`VibeGulo`) for string manipulation and global constants.
- **Custom Protocol**: Implementation of a persistent TCP-based communication layer.

## Project Structure

- `VibeSarkar.java`: The central routing server.
- `VibeBondhu.java`: The peer client application.
- `BhaibePotol.java`: Data packet structure for synchronization.
- `VibeGulo.java`: Global utility and constant library.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your system.

### Compilation

Compile all source files using the Java compiler:

```bash
javac *.java
```

### Execution

1. **Start the Router (Server):**
   ```bash
   java VibeSarkar
   ```
   The server will start listening for connections on port 8080.

2. **Start Peer Clients:**
   Open multiple terminals and run the client:
   ```bash
   java VibeBondhu
   ```

3. **Usage:**
   - Type any message to broadcast it to all other connected peers.
   - Use the prefix `ulta:` (e.g., `ulta:hello`) to broadcast a reversed version of the message.
   - Type `exit` to disconnect.

## Technical Implementation Details

- **Concurrency**: Utilizes `Thread` and `CopyOnWriteArrayList` to ensure thread-safe broadcast operations.
- **Networking**: Implements `ServerSocket` for incoming connections and persistent `Socket` streams for bi-directional communication.
- **I/O Management**: Uses `BufferedReader` and `PrintWriter` for efficient character-stream handling over network sockets.

## License

MIT
