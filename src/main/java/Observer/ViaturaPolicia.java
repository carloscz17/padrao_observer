package Observer;

import java.util.Observer;

// Interface para representar uma viatura policial
interface ViaturaPolicia extends Observer {
    void update(String acao);
}