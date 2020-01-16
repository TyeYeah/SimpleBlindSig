# Simple Blind Signatures

## Why these

From the so-called Undergraduate Science and Technology Project.

As you know, Blind Signature, Blockchain, Differential Privacy and Homomorphic Encryption are four research directions in Information Security.

This is a sample of blind signature

## Project Structure

```bash
.
├── README.md
├── blind-signatures-intro-demo
│   └── src
│       ├── BlindSigSample.java
│       ├── Client.java
│       ├── Signer.java
│       └── Transform.java
├── paper-cn
│   ├── ECC&E-voting
│   │   ├── ECC
│   │   ├── and
│   │   ├── E-voting
│   │   ├── related
│   │   ├── papers
│   │   └── ...
│   ├── others
│   │   ├── some
│   │   ├── other
│   │   ├── papers
│   │   └── ...
│   └── summary
│       ├── some
│       ├── summary
│       ├── papers
│       └── ...
└── paper-en
    ├── 1982-Chaum-BlindSigForPayment.pdf
    ├── 1993-Provable Secure and Practical Identification Schemes and Corresponding Signature Schemes.pdf
    ├── 1994-Blind Signatures Based on the Discrete Logarithm Problem.pdf
    ├── 1995-Cryptanalysis of the Blind Signature Based on the Discrete Logarithm Problem.pdf
    ├── An Application of time stamped proxy.pdf
    ├── Cryptanalysis of Blind Signature Schemes.pdf
    ├── Fair Blind Signatures.pdf
    ├── Lattice-based Blind Signatures.pdf
    ├── Round Optimal Blind Signatures.pdf
    └── Short Blind Signatures.pdf

```

## Usage

Several lines means it has no practical functions but theoretical method, and according comments.

So just read, no need to run the code.

- BlindSigSample.java
--> a complete sample
- Client.java
--> what a client should do
- Server.java
--> what a signer should do
- Transform.java
--> from str/int to int/str
